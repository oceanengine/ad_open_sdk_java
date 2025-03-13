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
import com.bytedance.ads.model.CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner;
import com.bytedance.ads.model.CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner;
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
 * CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner {
  public static final String SERIALIZED_NAME_CAPITAL_DETAIL_LIST = "capital_detail_list";
  @SerializedName(SERIALIZED_NAME_CAPITAL_DETAIL_LIST)
  private List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner> capitalDetailList = null;

  public static final String SERIALIZED_NAME_PAYEE_TRANSFER_AMOUNT_DETAIL_LIST = "payee_transfer_amount_detail_list";
  @SerializedName(SERIALIZED_NAME_PAYEE_TRANSFER_AMOUNT_DETAIL_LIST)
  private List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> payeeTransferAmountDetailList = null;

  public static final String SERIALIZED_NAME_REMITTER_ACCOUNT_ID = "remitter_account_id";
  @SerializedName(SERIALIZED_NAME_REMITTER_ACCOUNT_ID)
  private Long remitterAccountId = null;

  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner() {
  }

  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner capitalDetailList(List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner> capitalDetailList) {
    
    this.capitalDetailList = capitalDetailList;
    return this;
  }

  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner addCapitalDetailListItem(CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner capitalDetailListItem) {
    if (this.capitalDetailList == null) {
      this.capitalDetailList = new ArrayList<>();
    }
    this.capitalDetailList.add(capitalDetailListItem);
    return this;
  }

   /**
   * 减款方可转资金列表
   * @return capitalDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner> getCapitalDetailList() {
    return capitalDetailList;
  }


  public void setCapitalDetailList(List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner> capitalDetailList) {
    this.capitalDetailList = capitalDetailList;
  }


  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner payeeTransferAmountDetailList(List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> payeeTransferAmountDetailList) {
    
    this.payeeTransferAmountDetailList = payeeTransferAmountDetailList;
    return this;
  }

  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner addPayeeTransferAmountDetailListItem(CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner payeeTransferAmountDetailListItem) {
    if (this.payeeTransferAmountDetailList == null) {
      this.payeeTransferAmountDetailList = new ArrayList<>();
    }
    this.payeeTransferAmountDetailList.add(payeeTransferAmountDetailListItem);
    return this;
  }

   /**
   * 加款方可转余额信息列表
   * @return payeeTransferAmountDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> getPayeeTransferAmountDetailList() {
    return payeeTransferAmountDetailList;
  }


  public void setPayeeTransferAmountDetailList(List<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> payeeTransferAmountDetailList) {
    this.payeeTransferAmountDetailList = payeeTransferAmountDetailList;
  }


  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner remitterAccountId(Long remitterAccountId) {
    
    this.remitterAccountId = remitterAccountId;
    return this;
  }

   /**
   * 减款方账户id
   * @return remitterAccountId
  **/
  @javax.annotation.Nullable
  public Long getRemitterAccountId() {
    return remitterAccountId;
  }


  public void setRemitterAccountId(Long remitterAccountId) {
    this.remitterAccountId = remitterAccountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner cgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner = (CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner) o;
    return Objects.equals(this.capitalDetailList, cgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner.capitalDetailList) &&
        Objects.equals(this.payeeTransferAmountDetailList, cgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner.payeeTransferAmountDetailList) &&
        Objects.equals(this.remitterAccountId, cgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner.remitterAccountId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalDetailList, payeeTransferAmountDetailList, remitterAccountId);
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
    sb.append("class CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner {\n");
    sb.append("    capitalDetailList: ").append(toIndentedString(capitalDetailList)).append("\n");
    sb.append("    payeeTransferAmountDetailList: ").append(toIndentedString(payeeTransferAmountDetailList)).append("\n");
    sb.append("    remitterAccountId: ").append(toIndentedString(remitterAccountId)).append("\n");
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
    openapiFields.add("payee_transfer_amount_detail_list");
    openapiFields.add("remitter_account_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner
  */
  public static CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

