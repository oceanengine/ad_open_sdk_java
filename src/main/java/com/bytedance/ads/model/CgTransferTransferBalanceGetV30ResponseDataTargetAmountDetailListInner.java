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
import com.bytedance.ads.model.CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInnerCapitalDetailListInner;
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
 * CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner {
  public static final String SERIALIZED_NAME_CAPITAL_DETAIL_LIST = "capital_detail_list";
  @SerializedName(SERIALIZED_NAME_CAPITAL_DETAIL_LIST)
  private List<CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInnerCapitalDetailListInner> capitalDetailList = null;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "deposit_amount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Long depositAmount = null;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private Long targetId = null;

  public static final String SERIALIZED_NAME_TOTAL_TRANSFER_AMOUNT = "total_transfer_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSFER_AMOUNT)
  private Long totalTransferAmount = null;

  public CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner() {
  }

  public CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner capitalDetailList(List<CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInnerCapitalDetailListInner> capitalDetailList) {
    
    this.capitalDetailList = capitalDetailList;
    return this;
  }

  public CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner addCapitalDetailListItem(CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInnerCapitalDetailListInner capitalDetailListItem) {
    if (this.capitalDetailList == null) {
      this.capitalDetailList = new ArrayList<>();
    }
    this.capitalDetailList.add(capitalDetailListItem);
    return this;
  }

   /**
   * 可转资金列表
   * @return capitalDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInnerCapitalDetailListInner> getCapitalDetailList() {
    return capitalDetailList;
  }


  public void setCapitalDetailList(List<CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInnerCapitalDetailListInner> capitalDetailList) {
    this.capitalDetailList = capitalDetailList;
  }


  public CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner depositAmount(Long depositAmount) {
    
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * 竞价消耗保证金金额(单位：分)
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  public Long getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Long depositAmount) {
    this.depositAmount = depositAmount;
  }


  public CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner targetId(Long targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 账户id
   * @return targetId
  **/
  @javax.annotation.Nullable
  public Long getTargetId() {
    return targetId;
  }


  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  public CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner totalTransferAmount(Long totalTransferAmount) {
    
    this.totalTransferAmount = totalTransferAmount;
    return this;
  }

   /**
   * 总可转金额(单位：分)
   * @return totalTransferAmount
  **/
  @javax.annotation.Nullable
  public Long getTotalTransferAmount() {
    return totalTransferAmount;
  }


  public void setTotalTransferAmount(Long totalTransferAmount) {
    this.totalTransferAmount = totalTransferAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner cgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner = (CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner) o;
    return Objects.equals(this.capitalDetailList, cgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner.capitalDetailList) &&
        Objects.equals(this.depositAmount, cgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner.depositAmount) &&
        Objects.equals(this.targetId, cgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner.targetId) &&
        Objects.equals(this.totalTransferAmount, cgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner.totalTransferAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalDetailList, depositAmount, targetId, totalTransferAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner {\n");
    sb.append("    capitalDetailList: ").append(toIndentedString(capitalDetailList)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    totalTransferAmount: ").append(toIndentedString(totalTransferAmount)).append("\n");
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
    openapiFields.add("capital_detail_list");
    openapiFields.add("deposit_amount");
    openapiFields.add("target_id");
    openapiFields.add("total_transfer_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("capital_detail_list");
    openapiRequiredFields.add("deposit_amount");
    openapiRequiredFields.add("target_id");
    openapiRequiredFields.add("total_transfer_amount");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner
  */
  public static CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferTransferBalanceGetV30ResponseDataTargetAmountDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

