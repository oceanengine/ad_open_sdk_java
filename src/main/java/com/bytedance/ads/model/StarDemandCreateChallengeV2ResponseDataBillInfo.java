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
 * 账单明细
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class StarDemandCreateChallengeV2ResponseDataBillInfo {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance = null;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Long totalAmount = null;

  public static final String SERIALIZED_NAME_TOTAL_PLATFORM_FEE = "total_platform_fee";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLATFORM_FEE)
  private Long totalPlatformFee = null;

  public static final String SERIALIZED_NAME_TOTAL_TASK_COST = "total_task_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASK_COST)
  private Long totalTaskCost = null;

  public StarDemandCreateChallengeV2ResponseDataBillInfo() {
  }

  public StarDemandCreateChallengeV2ResponseDataBillInfo balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * （任务发布后）可用余额（单位元，下同）
   * @return balance
  **/
  @javax.annotation.Nullable
  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public StarDemandCreateChallengeV2ResponseDataBillInfo totalAmount(Long totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 总金额（预算+服务费）
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public Long getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }


  public StarDemandCreateChallengeV2ResponseDataBillInfo totalPlatformFee(Long totalPlatformFee) {
    
    this.totalPlatformFee = totalPlatformFee;
    return this;
  }

   /**
   * 服务费
   * @return totalPlatformFee
  **/
  @javax.annotation.Nullable
  public Long getTotalPlatformFee() {
    return totalPlatformFee;
  }


  public void setTotalPlatformFee(Long totalPlatformFee) {
    this.totalPlatformFee = totalPlatformFee;
  }


  public StarDemandCreateChallengeV2ResponseDataBillInfo totalTaskCost(Long totalTaskCost) {
    
    this.totalTaskCost = totalTaskCost;
    return this;
  }

   /**
   * 任务金额（预算）
   * @return totalTaskCost
  **/
  @javax.annotation.Nullable
  public Long getTotalTaskCost() {
    return totalTaskCost;
  }


  public void setTotalTaskCost(Long totalTaskCost) {
    this.totalTaskCost = totalTaskCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2ResponseDataBillInfo starDemandCreateChallengeV2ResponseDataBillInfo = (StarDemandCreateChallengeV2ResponseDataBillInfo) o;
    return Objects.equals(this.balance, starDemandCreateChallengeV2ResponseDataBillInfo.balance) &&
        Objects.equals(this.totalAmount, starDemandCreateChallengeV2ResponseDataBillInfo.totalAmount) &&
        Objects.equals(this.totalPlatformFee, starDemandCreateChallengeV2ResponseDataBillInfo.totalPlatformFee) &&
        Objects.equals(this.totalTaskCost, starDemandCreateChallengeV2ResponseDataBillInfo.totalTaskCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, totalAmount, totalPlatformFee, totalTaskCost);
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
    sb.append("class StarDemandCreateChallengeV2ResponseDataBillInfo {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalPlatformFee: ").append(toIndentedString(totalPlatformFee)).append("\n");
    sb.append("    totalTaskCost: ").append(toIndentedString(totalTaskCost)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("total_amount");
    openapiFields.add("total_platform_fee");
    openapiFields.add("total_task_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2ResponseDataBillInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2ResponseDataBillInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2ResponseDataBillInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2ResponseDataBillInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2ResponseDataBillInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2ResponseDataBillInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2ResponseDataBillInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2ResponseDataBillInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2ResponseDataBillInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2ResponseDataBillInfo
  */
  public static StarDemandCreateChallengeV2ResponseDataBillInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2ResponseDataBillInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2ResponseDataBillInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

