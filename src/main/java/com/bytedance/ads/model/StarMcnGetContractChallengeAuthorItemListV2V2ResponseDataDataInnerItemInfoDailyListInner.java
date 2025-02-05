/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
 * StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner {
  public static final String SERIALIZED_NAME_AUTHOR_AMOUNT = "author_amount";
  @SerializedName(SERIALIZED_NAME_AUTHOR_AMOUNT)
  private Long authorAmount = null;

  public static final String SERIALIZED_NAME_AUTHOR_AMOUNT_IAA = "author_amount_iaa";
  @SerializedName(SERIALIZED_NAME_AUTHOR_AMOUNT_IAA)
  private Long authorAmountIaa = null;

  public static final String SERIALIZED_NAME_AUTHOR_AMOUNT_IAP = "author_amount_iap";
  @SerializedName(SERIALIZED_NAME_AUTHOR_AMOUNT_IAP)
  private Long authorAmountIap = null;

  public static final String SERIALIZED_NAME_IAA_INCOME_DAILY = "iaa_income_daily";
  @SerializedName(SERIALIZED_NAME_IAA_INCOME_DAILY)
  private String iaaIncomeDaily = null;

  public static final String SERIALIZED_NAME_P_DATE = "p_date";
  @SerializedName(SERIALIZED_NAME_P_DATE)
  private String pDate = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT = "service_provider_amount";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT)
  private Long serviceProviderAmount = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT_IAA = "service_provider_amount_iaa";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT_IAA)
  private Long serviceProviderAmountIaa = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT_IAP = "service_provider_amount_iap";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_AMOUNT_IAP)
  private Long serviceProviderAmountIap = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE = "share_price";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE)
  private Long sharePrice = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_IAA = "share_price_iaa";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_IAA)
  private Long sharePriceIaa = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_IAP = "share_price_iap";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_IAP)
  private Long sharePriceIap = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_TOTAL = "share_price_total";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_TOTAL)
  private Long sharePriceTotal = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_TOTAL_IAA = "share_price_total_iaa";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_TOTAL_IAA)
  private Long sharePriceTotalIaa = null;

  public static final String SERIALIZED_NAME_SHARE_PRICE_TOTAL_IAP = "share_price_total_iap";
  @SerializedName(SERIALIZED_NAME_SHARE_PRICE_TOTAL_IAP)
  private Long sharePriceTotalIap = null;

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner() {
  }

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner authorAmount(Long authorAmount) {
    
    this.authorAmount = authorAmount;
    return this;
  }

   /**
   * 达人已发放收益
   * @return authorAmount
  **/
  @javax.annotation.Nullable
  public Long getAuthorAmount() {
    return authorAmount;
  }


  public void setAuthorAmount(Long authorAmount) {
    this.authorAmount = authorAmount;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner authorAmountIaa(Long authorAmountIaa) {
    
    this.authorAmountIaa = authorAmountIaa;
    return this;
  }

   /**
   * 
   * @return authorAmountIaa
  **/
  @javax.annotation.Nullable
  public Long getAuthorAmountIaa() {
    return authorAmountIaa;
  }


  public void setAuthorAmountIaa(Long authorAmountIaa) {
    this.authorAmountIaa = authorAmountIaa;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner authorAmountIap(Long authorAmountIap) {
    
    this.authorAmountIap = authorAmountIap;
    return this;
  }

   /**
   * 
   * @return authorAmountIap
  **/
  @javax.annotation.Nullable
  public Long getAuthorAmountIap() {
    return authorAmountIap;
  }


  public void setAuthorAmountIap(Long authorAmountIap) {
    this.authorAmountIap = authorAmountIap;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner iaaIncomeDaily(String iaaIncomeDaily) {
    
    this.iaaIncomeDaily = iaaIncomeDaily;
    return this;
  }

   /**
   * item_id 产生的分天广告收益，单位为厘（元*1000）
   * @return iaaIncomeDaily
  **/
  @javax.annotation.Nullable
  public String getIaaIncomeDaily() {
    return iaaIncomeDaily;
  }


  public void setIaaIncomeDaily(String iaaIncomeDaily) {
    this.iaaIncomeDaily = iaaIncomeDaily;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner pDate(String pDate) {
    
    this.pDate = pDate;
    return this;
  }

   /**
   * 
   * @return pDate
  **/
  @javax.annotation.Nullable
  public String getpDate() {
    return pDate;
  }


  public void setpDate(String pDate) {
    this.pDate = pDate;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner serviceProviderAmount(Long serviceProviderAmount) {
    
    this.serviceProviderAmount = serviceProviderAmount;
    return this;
  }

   /**
   * 撮合中介已发放佣金(和mcn_amount类似)，单位为厘（元*1000）
   * @return serviceProviderAmount
  **/
  @javax.annotation.Nullable
  public Long getServiceProviderAmount() {
    return serviceProviderAmount;
  }


  public void setServiceProviderAmount(Long serviceProviderAmount) {
    this.serviceProviderAmount = serviceProviderAmount;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner serviceProviderAmountIaa(Long serviceProviderAmountIaa) {
    
    this.serviceProviderAmountIaa = serviceProviderAmountIaa;
    return this;
  }

   /**
   * 
   * @return serviceProviderAmountIaa
  **/
  @javax.annotation.Nullable
  public Long getServiceProviderAmountIaa() {
    return serviceProviderAmountIaa;
  }


  public void setServiceProviderAmountIaa(Long serviceProviderAmountIaa) {
    this.serviceProviderAmountIaa = serviceProviderAmountIaa;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner serviceProviderAmountIap(Long serviceProviderAmountIap) {
    
    this.serviceProviderAmountIap = serviceProviderAmountIap;
    return this;
  }

   /**
   * 
   * @return serviceProviderAmountIap
  **/
  @javax.annotation.Nullable
  public Long getServiceProviderAmountIap() {
    return serviceProviderAmountIap;
  }


  public void setServiceProviderAmountIap(Long serviceProviderAmountIap) {
    this.serviceProviderAmountIap = serviceProviderAmountIap;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner sharePrice(Long sharePrice) {
    
    this.sharePrice = sharePrice;
    return this;
  }

   /**
   * 
   * @return sharePrice
  **/
  @javax.annotation.Nullable
  public Long getSharePrice() {
    return sharePrice;
  }


  public void setSharePrice(Long sharePrice) {
    this.sharePrice = sharePrice;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner sharePriceIaa(Long sharePriceIaa) {
    
    this.sharePriceIaa = sharePriceIaa;
    return this;
  }

   /**
   * 
   * @return sharePriceIaa
  **/
  @javax.annotation.Nullable
  public Long getSharePriceIaa() {
    return sharePriceIaa;
  }


  public void setSharePriceIaa(Long sharePriceIaa) {
    this.sharePriceIaa = sharePriceIaa;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner sharePriceIap(Long sharePriceIap) {
    
    this.sharePriceIap = sharePriceIap;
    return this;
  }

   /**
   * 
   * @return sharePriceIap
  **/
  @javax.annotation.Nullable
  public Long getSharePriceIap() {
    return sharePriceIap;
  }


  public void setSharePriceIap(Long sharePriceIap) {
    this.sharePriceIap = sharePriceIap;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner sharePriceTotal(Long sharePriceTotal) {
    
    this.sharePriceTotal = sharePriceTotal;
    return this;
  }

   /**
   * 
   * @return sharePriceTotal
  **/
  @javax.annotation.Nullable
  public Long getSharePriceTotal() {
    return sharePriceTotal;
  }


  public void setSharePriceTotal(Long sharePriceTotal) {
    this.sharePriceTotal = sharePriceTotal;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner sharePriceTotalIaa(Long sharePriceTotalIaa) {
    
    this.sharePriceTotalIaa = sharePriceTotalIaa;
    return this;
  }

   /**
   * 
   * @return sharePriceTotalIaa
  **/
  @javax.annotation.Nullable
  public Long getSharePriceTotalIaa() {
    return sharePriceTotalIaa;
  }


  public void setSharePriceTotalIaa(Long sharePriceTotalIaa) {
    this.sharePriceTotalIaa = sharePriceTotalIaa;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner sharePriceTotalIap(Long sharePriceTotalIap) {
    
    this.sharePriceTotalIap = sharePriceTotalIap;
    return this;
  }

   /**
   * 
   * @return sharePriceTotalIap
  **/
  @javax.annotation.Nullable
  public Long getSharePriceTotalIap() {
    return sharePriceTotalIap;
  }


  public void setSharePriceTotalIap(Long sharePriceTotalIap) {
    this.sharePriceTotalIap = sharePriceTotalIap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner = (StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner) o;
    return Objects.equals(this.authorAmount, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.authorAmount) &&
        Objects.equals(this.authorAmountIaa, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.authorAmountIaa) &&
        Objects.equals(this.authorAmountIap, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.authorAmountIap) &&
        Objects.equals(this.iaaIncomeDaily, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.iaaIncomeDaily) &&
        Objects.equals(this.pDate, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.pDate) &&
        Objects.equals(this.serviceProviderAmount, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.serviceProviderAmount) &&
        Objects.equals(this.serviceProviderAmountIaa, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.serviceProviderAmountIaa) &&
        Objects.equals(this.serviceProviderAmountIap, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.serviceProviderAmountIap) &&
        Objects.equals(this.sharePrice, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.sharePrice) &&
        Objects.equals(this.sharePriceIaa, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.sharePriceIaa) &&
        Objects.equals(this.sharePriceIap, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.sharePriceIap) &&
        Objects.equals(this.sharePriceTotal, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.sharePriceTotal) &&
        Objects.equals(this.sharePriceTotalIaa, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.sharePriceTotalIaa) &&
        Objects.equals(this.sharePriceTotalIap, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.sharePriceTotalIap);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorAmount, authorAmountIaa, authorAmountIap, iaaIncomeDaily, pDate, serviceProviderAmount, serviceProviderAmountIaa, serviceProviderAmountIap, sharePrice, sharePriceIaa, sharePriceIap, sharePriceTotal, sharePriceTotalIaa, sharePriceTotalIap);
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
    sb.append("class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner {\n");
    sb.append("    authorAmount: ").append(toIndentedString(authorAmount)).append("\n");
    sb.append("    authorAmountIaa: ").append(toIndentedString(authorAmountIaa)).append("\n");
    sb.append("    authorAmountIap: ").append(toIndentedString(authorAmountIap)).append("\n");
    sb.append("    iaaIncomeDaily: ").append(toIndentedString(iaaIncomeDaily)).append("\n");
    sb.append("    pDate: ").append(toIndentedString(pDate)).append("\n");
    sb.append("    serviceProviderAmount: ").append(toIndentedString(serviceProviderAmount)).append("\n");
    sb.append("    serviceProviderAmountIaa: ").append(toIndentedString(serviceProviderAmountIaa)).append("\n");
    sb.append("    serviceProviderAmountIap: ").append(toIndentedString(serviceProviderAmountIap)).append("\n");
    sb.append("    sharePrice: ").append(toIndentedString(sharePrice)).append("\n");
    sb.append("    sharePriceIaa: ").append(toIndentedString(sharePriceIaa)).append("\n");
    sb.append("    sharePriceIap: ").append(toIndentedString(sharePriceIap)).append("\n");
    sb.append("    sharePriceTotal: ").append(toIndentedString(sharePriceTotal)).append("\n");
    sb.append("    sharePriceTotalIaa: ").append(toIndentedString(sharePriceTotalIaa)).append("\n");
    sb.append("    sharePriceTotalIap: ").append(toIndentedString(sharePriceTotalIap)).append("\n");
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
    openapiFields.add("author_amount");
    openapiFields.add("author_amount_iaa");
    openapiFields.add("author_amount_iap");
    openapiFields.add("iaa_income_daily");
    openapiFields.add("p_date");
    openapiFields.add("service_provider_amount");
    openapiFields.add("service_provider_amount_iaa");
    openapiFields.add("service_provider_amount_iap");
    openapiFields.add("share_price");
    openapiFields.add("share_price_iaa");
    openapiFields.add("share_price_iap");
    openapiFields.add("share_price_total");
    openapiFields.add("share_price_total_iaa");
    openapiFields.add("share_price_total_iap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner>() {
           @Override
           public void write(JsonWriter out, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner
  */
  public static StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner.class);
  }

 /**
  * Convert an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerItemInfoDailyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

