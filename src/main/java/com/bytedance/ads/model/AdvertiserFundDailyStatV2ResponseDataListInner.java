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
 * AdvertiserFundDailyStatV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AdvertiserFundDailyStatV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance = null;

  public static final String SERIALIZED_NAME_CASH_COST = "cash_cost";
  @SerializedName(SERIALIZED_NAME_CASH_COST)
  private Double cashCost = null;

  public static final String SERIALIZED_NAME_COMPANY_WALLET_COST = "company_wallet_cost";
  @SerializedName(SERIALIZED_NAME_COMPANY_WALLET_COST)
  private Double companyWalletCost = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_FROZEN = "frozen";
  @SerializedName(SERIALIZED_NAME_FROZEN)
  private Double frozen = null;

  public static final String SERIALIZED_NAME_GRANT_BALANCE = "grant_balance";
  @SerializedName(SERIALIZED_NAME_GRANT_BALANCE)
  private Double grantBalance = null;

  public static final String SERIALIZED_NAME_INCOME = "income";
  @SerializedName(SERIALIZED_NAME_INCOME)
  private Double income = null;

  public static final String SERIALIZED_NAME_NON_GRANT_BALANCE = "non_grant_balance";
  @SerializedName(SERIALIZED_NAME_NON_GRANT_BALANCE)
  private Double nonGrantBalance = null;

  public static final String SERIALIZED_NAME_REWARD_COST = "reward_cost";
  @SerializedName(SERIALIZED_NAME_REWARD_COST)
  private Double rewardCost = null;

  public static final String SERIALIZED_NAME_SHARED_WALLET_COST = "shared_wallet_cost";
  @SerializedName(SERIALIZED_NAME_SHARED_WALLET_COST)
  private Double sharedWalletCost = null;

  public static final String SERIALIZED_NAME_TRANSFER_IN = "transfer_in";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN)
  private Double transferIn = null;

  public static final String SERIALIZED_NAME_TRANSFER_OUT = "transfer_out";
  @SerializedName(SERIALIZED_NAME_TRANSFER_OUT)
  private Double transferOut = null;

  public AdvertiserFundDailyStatV2ResponseDataListInner() {
  }

  public AdvertiserFundDailyStatV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner balance(Double balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 
   * @return balance
  **/
  @javax.annotation.Nullable
  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    this.balance = balance;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner cashCost(Double cashCost) {
    
    this.cashCost = cashCost;
    return this;
  }

   /**
   * 
   * @return cashCost
  **/
  @javax.annotation.Nullable
  public Double getCashCost() {
    return cashCost;
  }


  public void setCashCost(Double cashCost) {
    this.cashCost = cashCost;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner companyWalletCost(Double companyWalletCost) {
    
    this.companyWalletCost = companyWalletCost;
    return this;
  }

   /**
   * 
   * @return companyWalletCost
  **/
  @javax.annotation.Nullable
  public Double getCompanyWalletCost() {
    return companyWalletCost;
  }


  public void setCompanyWalletCost(Double companyWalletCost) {
    this.companyWalletCost = companyWalletCost;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner frozen(Double frozen) {
    
    this.frozen = frozen;
    return this;
  }

   /**
   * 
   * @return frozen
  **/
  @javax.annotation.Nullable
  public Double getFrozen() {
    return frozen;
  }


  public void setFrozen(Double frozen) {
    this.frozen = frozen;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner grantBalance(Double grantBalance) {
    
    this.grantBalance = grantBalance;
    return this;
  }

   /**
   * 
   * @return grantBalance
  **/
  @javax.annotation.Nullable
  public Double getGrantBalance() {
    return grantBalance;
  }


  public void setGrantBalance(Double grantBalance) {
    this.grantBalance = grantBalance;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner income(Double income) {
    
    this.income = income;
    return this;
  }

   /**
   * 
   * @return income
  **/
  @javax.annotation.Nullable
  public Double getIncome() {
    return income;
  }


  public void setIncome(Double income) {
    this.income = income;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner nonGrantBalance(Double nonGrantBalance) {
    
    this.nonGrantBalance = nonGrantBalance;
    return this;
  }

   /**
   * 
   * @return nonGrantBalance
  **/
  @javax.annotation.Nullable
  public Double getNonGrantBalance() {
    return nonGrantBalance;
  }


  public void setNonGrantBalance(Double nonGrantBalance) {
    this.nonGrantBalance = nonGrantBalance;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner rewardCost(Double rewardCost) {
    
    this.rewardCost = rewardCost;
    return this;
  }

   /**
   * 
   * @return rewardCost
  **/
  @javax.annotation.Nullable
  public Double getRewardCost() {
    return rewardCost;
  }


  public void setRewardCost(Double rewardCost) {
    this.rewardCost = rewardCost;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner sharedWalletCost(Double sharedWalletCost) {
    
    this.sharedWalletCost = sharedWalletCost;
    return this;
  }

   /**
   * 
   * @return sharedWalletCost
  **/
  @javax.annotation.Nullable
  public Double getSharedWalletCost() {
    return sharedWalletCost;
  }


  public void setSharedWalletCost(Double sharedWalletCost) {
    this.sharedWalletCost = sharedWalletCost;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner transferIn(Double transferIn) {
    
    this.transferIn = transferIn;
    return this;
  }

   /**
   * 
   * @return transferIn
  **/
  @javax.annotation.Nullable
  public Double getTransferIn() {
    return transferIn;
  }


  public void setTransferIn(Double transferIn) {
    this.transferIn = transferIn;
  }


  public AdvertiserFundDailyStatV2ResponseDataListInner transferOut(Double transferOut) {
    
    this.transferOut = transferOut;
    return this;
  }

   /**
   * 
   * @return transferOut
  **/
  @javax.annotation.Nullable
  public Double getTransferOut() {
    return transferOut;
  }


  public void setTransferOut(Double transferOut) {
    this.transferOut = transferOut;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserFundDailyStatV2ResponseDataListInner advertiserFundDailyStatV2ResponseDataListInner = (AdvertiserFundDailyStatV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, advertiserFundDailyStatV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.balance, advertiserFundDailyStatV2ResponseDataListInner.balance) &&
        Objects.equals(this.cashCost, advertiserFundDailyStatV2ResponseDataListInner.cashCost) &&
        Objects.equals(this.companyWalletCost, advertiserFundDailyStatV2ResponseDataListInner.companyWalletCost) &&
        Objects.equals(this.cost, advertiserFundDailyStatV2ResponseDataListInner.cost) &&
        Objects.equals(this.date, advertiserFundDailyStatV2ResponseDataListInner.date) &&
        Objects.equals(this.frozen, advertiserFundDailyStatV2ResponseDataListInner.frozen) &&
        Objects.equals(this.grantBalance, advertiserFundDailyStatV2ResponseDataListInner.grantBalance) &&
        Objects.equals(this.income, advertiserFundDailyStatV2ResponseDataListInner.income) &&
        Objects.equals(this.nonGrantBalance, advertiserFundDailyStatV2ResponseDataListInner.nonGrantBalance) &&
        Objects.equals(this.rewardCost, advertiserFundDailyStatV2ResponseDataListInner.rewardCost) &&
        Objects.equals(this.sharedWalletCost, advertiserFundDailyStatV2ResponseDataListInner.sharedWalletCost) &&
        Objects.equals(this.transferIn, advertiserFundDailyStatV2ResponseDataListInner.transferIn) &&
        Objects.equals(this.transferOut, advertiserFundDailyStatV2ResponseDataListInner.transferOut);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, balance, cashCost, companyWalletCost, cost, date, frozen, grantBalance, income, nonGrantBalance, rewardCost, sharedWalletCost, transferIn, transferOut);
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
    sb.append("class AdvertiserFundDailyStatV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cashCost: ").append(toIndentedString(cashCost)).append("\n");
    sb.append("    companyWalletCost: ").append(toIndentedString(companyWalletCost)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
    sb.append("    grantBalance: ").append(toIndentedString(grantBalance)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    nonGrantBalance: ").append(toIndentedString(nonGrantBalance)).append("\n");
    sb.append("    rewardCost: ").append(toIndentedString(rewardCost)).append("\n");
    sb.append("    sharedWalletCost: ").append(toIndentedString(sharedWalletCost)).append("\n");
    sb.append("    transferIn: ").append(toIndentedString(transferIn)).append("\n");
    sb.append("    transferOut: ").append(toIndentedString(transferOut)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("cash_cost");
    openapiFields.add("company_wallet_cost");
    openapiFields.add("cost");
    openapiFields.add("date");
    openapiFields.add("frozen");
    openapiFields.add("grant_balance");
    openapiFields.add("income");
    openapiFields.add("non_grant_balance");
    openapiFields.add("reward_cost");
    openapiFields.add("shared_wallet_cost");
    openapiFields.add("transfer_in");
    openapiFields.add("transfer_out");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserFundDailyStatV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserFundDailyStatV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserFundDailyStatV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserFundDailyStatV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserFundDailyStatV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserFundDailyStatV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserFundDailyStatV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserFundDailyStatV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserFundDailyStatV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserFundDailyStatV2ResponseDataListInner
  */
  public static AdvertiserFundDailyStatV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserFundDailyStatV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdvertiserFundDailyStatV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

